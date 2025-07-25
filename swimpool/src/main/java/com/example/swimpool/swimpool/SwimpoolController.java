package com.example.swimpool.swimpool;

import com.example.swimpool.common.ResponseCode;
import com.example.swimpool.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/swimpool")
public class SwimpoolController {
    @Autowired
    private SwimpoolService swimpoolService;

    @GetMapping("List")
    public ResponseEntity<ResponseDto> loadData(){
        try {
            List<SwimpoolDto> arraylist = this.swimpoolService.findAll();
            return ResponseEntity.ok(this.getResponseDto(ResponseCode.SUCCESS , "ok", arraylist));
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(this.getResponseDto(ResponseCode.SELECT_FAIL, "error", null));
        }
    }

    private ResponseDto getResponseDto(ResponseCode eCode, String msg, Object data) {
        return ResponseDto.builder()
                .code(eCode)
                .message(msg)
                .responseData(data)
                .build();
    }

}

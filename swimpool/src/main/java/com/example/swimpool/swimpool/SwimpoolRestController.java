package com.example.swimpool.swimpool;

import com.example.swimpool.common.ResponseEnum;
import com.example.swimpool.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/swimpool")
public class SwimpoolRestController {
    @Autowired
    private SwimpoolService swimpoolService;

    // 데이터 목록을 출력하는 RestFull API
    @GetMapping("/list")
    public ResponseEntity<ResponseDto> list() {
        try {
            List<SwimpoolDto> list = this.swimpoolService.findAll();  // DB 에서 데이터 목록을 검색해서 리턴해야 한다.
            return ResponseEntity.ok().body(
                    new ResponseDto(ResponseEnum.Success, "OK", list)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    new ResponseDto(ResponseEnum.SelectFail, "Error", e)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        }
    }

    // 데이터 1개를 출력하는 RestFull API
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getOne(@PathVariable Integer id) {
        try {
            SwimpoolDto one = this.swimpoolService.findSwimpool(id);   // id 번호로 DB 에서 찾아서 리턴해야 한다.
            return ResponseEntity.ok().body(
                    new ResponseDto(ResponseEnum.Success, "OK", one)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    new ResponseDto(ResponseEnum.SelectFail, "Error", e)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        }
    }

    // 데이터 1개를 삽입하는 RestFull API
    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody SwimpoolDto dto) {
        try {
            SwimpoolDto result = this.swimpoolService.addSwimpool(dto);   // DB 에 insert 쿼리 실행 결과를 리턴한다.
            return ResponseEntity.ok().body(
                    new ResponseDto(ResponseEnum.Success, "OK", result)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    new ResponseDto(ResponseEnum.InsertFail, "Error", e)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        }
    }

    // 데이터 1개를 U 수정하는 RestFull API
    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@PathVariable("id") Integer id
            , @RequestBody SwimpoolDto dto) {
        try {
            dto.setId(id);
            SwimpoolDto result = this.swimpoolService.updateSwimpool(dto);   // DB 에 update 쿼리 실행 결과를 리턴한다.
            return ResponseEntity.ok().body(
                    new ResponseDto(ResponseEnum.Success, "OK", result)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    new ResponseDto(ResponseEnum.UpdateFail, "Error", e)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        }
    }

    // 데이터 1개를 D 삭제하는 RestFull API
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable("id") Integer id) {
        try {
            this.swimpoolService.deleteSwimpool(id);   // DB 에 update 쿼리 실행 결과를 리턴한다.
            return ResponseEntity.ok().body(
                    new ResponseDto(ResponseEnum.Success, "OK", true)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    new ResponseDto(ResponseEnum.DeleteFail, "Error", e)
                    // ResponseEntity 는 서버의 응답을 json 형식으로 문자열로 응답합니다.
            );
        }
    }
}

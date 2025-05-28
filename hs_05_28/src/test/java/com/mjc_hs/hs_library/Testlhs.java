package com.mjc_hs.hs_library;
import com.lhs.information.MjcValidCheck;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Testlhs {
    @Test
    public void testlhs() {
        MjcValidCheck m = new MjcValidCheck("","","");
        assertThat(m.isValidPhoneNumber(null)).isEqualTo(false);
        assertThat(m.isValidPhoneNumber("")).isEqualTo(false);
        assertThat(m.isValidPhoneNumber("010-39a2-0203")).isEqualTo(false);
        assertThat(m.isValidPhoneNumber("010-1111-2222")).isEqualTo(true);


        assertThat(m.isValidZipNumber("")).isEqualTo(false);
        assertThat(m.isValidZipNumber("01234")).isEqualTo(false);
        assertThat(m.isValidZipNumber("12023")).isEqualTo(true);


        assertThat(m.isValidEmail("")).isEqualTo(false);
        assertThat(m.isValidEmail("geghtrdf@naver,qwe")).isEqualTo(false);
        assertThat(m.isValidEmail("geghtrdf#naver.qwe")).isEqualTo(false);
        assertThat(m.isValidEmail("geghtrdf@@naver..qwe")).isEqualTo(false);
        assertThat(m.isValidEmail("@goals00002naver.com")).isEqualTo(false);
        assertThat(m.isValidEmail("goals00002@naver.com")).isEqualTo(true);

    }
}

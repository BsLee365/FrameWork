package com.jvision.admin.web.dto;

//임으로 추가해줘야 함.
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        String name = "홍길동";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

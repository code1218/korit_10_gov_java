package study.ch16;

import lombok.Builder;

@Builder
class UserEntity2 {
    private String username;
    private String password;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "김준일", "aa@gmail.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aa@gmail.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb");
        UserEntity userEntity4 = UserEntity.builder()
                .password("1111")
                .username("ccc")
                .email("ccc@gmail.com")
                .name("김준일")
                .build();

    }
}

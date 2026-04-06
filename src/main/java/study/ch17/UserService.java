package study.ch17;


public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int signup(String username, String password) {
        // 성공: 200, 실패: 400(중복 아이디), 500(공간부족)
        User foundUser = userRepository.findByUsername(username);
        if (foundUser != null) {
            return 400;
        }

//        User newUser = new User(0l, username, password);
        User newUser = User.builder()
                .username(username)
                .password(password)
                .build();
        boolean isSuccess = userRepository.addUser(newUser);
        if (!isSuccess) {
            return 500;
        }

        userRepository.printUsers();
        return 200;
    }
}

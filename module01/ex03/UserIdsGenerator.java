package module01.ex03;

public class UserIdsGenerator {
    private static Integer id;

    private UserIdsGenerator() {
        id = 0;
    }

    private static class SingletonHolder {
        private static final UserIdsGenerator INSTANCE = new UserIdsGenerator();
    }

    public static UserIdsGenerator getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Integer generateId() {
        return id += 1;
    }
}
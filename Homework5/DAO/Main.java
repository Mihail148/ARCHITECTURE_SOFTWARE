package Homework5.DAO;

//Пример использования
public class Main {
    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();

        User user1 = new User("Иван", 25);
        userDao.addUser(user1);

        User user2 = userDao.getUser("Дмитрий");
        user2.setAge(30);
        userDao.updateUser(user2);

        userDao.deleteUser(user2);
    }
}

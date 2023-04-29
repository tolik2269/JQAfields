public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Вася";
        post.passport = "3333 55555";
        post.patronymic = "Васильевич";
        post.phone = "+7 777 777 7777";
        post.surname = "Васильев";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 15;
        post.birthday.month = 12;
        post.birthday.year = 1998;

    }
}

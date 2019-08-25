package by.etc.final_task.task_one.Menu;

import by.etc.final_task.task_one.book.Book;
import by.etc.final_task.task_one.book.Electronic;
import by.etc.final_task.task_one.book.Paper;
import by.etc.final_task.task_one.email.Email;
import by.etc.final_task.task_one.library.Library;
import by.etc.final_task.task_one.user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private User user;
    private Library library;

    public Menu() {
        library = Library.getInstance();
        try {
            // library.createAdmin();
            System.out.println("Добро пожаловать в домашнюю библиотеку!");
            startMenu();
        } catch (IOException e) {

        }
    }

    private void startMenu() throws IOException {
        boolean flag = true;
        System.out.println("Вы в главном меню");
        if (user != null) {
            while (flag) {
                if (library.getRegData().getUsers().size() == 0) {
                    System.out.println("Библиотека не содержит пользователей, напишите reg для регистрации пользователя, либо exit для выхода из библиотеки!");
                    if (br.readLine().equals("reg")) {
                        registration();
                    } else if (br.readLine().equals("exit")) {
                        flag = false;
                        exit();

                    }
                } else {
                    System.out.println("Введите enter для входа, либо exit для выхода!");
                    String string = br.readLine();
                    if (string.equals("enter")) {
                        enter();
                    } else if (string.equals("exit")) {
                        flag = false;
                        exit();
                    } else {
                        System.out.println("Введите корректный ответ!");
                    }
                }
            }
        } else {
            System.out.println("Введите enter для входа, reg для регистрации или exit для выхода из библиотеки");
            String string = br.readLine();
            if (string.equals("reg")) {
                registration();
            } else if (string.equals("enter")) {
                enter();
            } else if (string.equals("exit")) {
                exit();
            } else {
                System.out.println("Введите корректный запрос !");
                startMenu();
            }
        }
    }

    private void registration() throws IOException {
        System.out.println("Регистрация пользователя : \n");
        System.out.print("Введите еммейл\n");
        String email = br.readLine();
        System.out.println("Введите пароль");
        String password = br.readLine();
        library.addUser(new User(email, password, "user"));
        System.out.println("Пользователь " + email + " успешно добавлен в регистрационный лист");
        startMenu();
    }

    private void exit() throws IOException {
        System.out.println("Всего доброго !");
        library.saveCatalog();
        library.saveRagData();
        br.close();
    }

    private void getLibraryStatus() {
        System.out.println("Кооличество пользователей : " + library.getRegData().getUsers().size());

        System.out.println("Кооличество книг : " + library.getCatalog().getBooks().size());
    }

    private void getAdminLibraryStatus() {
        System.out.println("Кооличество пользователей : " + library.getRegData().getUsers().size());
        System.out.println("____________________________________________________________");
        for (User u : library.getRegData().getUsers()) {
            System.out.println(u.getEmail() + " / " + u.getRole() + " / " + u.getPassword());
        }
        System.out.println("____________________________________________________________");
        System.out.println();
        System.out.println("Кооличество книг : " + library.getCatalog().getBooks().size());
        System.out.println("____________________________________________________________");
        for (Book b : library.getCatalog().getBooks()) {
            System.out.println(b.getTitle() + " / " + b.getAuthor());
        }
        System.out.println("____________________________________________________________");
    }

    private void enter() throws IOException {
        System.out.println("Вход в библиотеку : \n");
        System.out.print("Введите еммейл\n");
        String email = br.readLine();
        System.out.println("Введите пароль\n");
        String password = br.readLine();
        user = library.getUserByRegData(email, password);
        if (user != null) {
            if (user.getRole().equals("admin")) {
                adminMenu(user);
            } else if (user.getRole().equals("user")) {
                userMenu(user);
            }
        }

    }

    private void userMenu(User user) throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("Добро пожаловать ! " + user.getEmail());
            System.out.println();
            System.out.println("Для просмотра каталога книг введите view");
            System.out.println("Для поиска книги введите find");
            System.out.println("Для просмотра статуса библиотеки введите status");
            System.out.println("Чтобы отправить запрос на добавление книги в каталог введите add");
            System.out.println("Для выхода в главное меню введите menu");
            System.out.println();
            String string = br.readLine();

            switch (string) {
                case ("view"):
                    view();
                    break;
                case ("status"):
                    getLibraryStatus();
                    break;
                case ("find"):
                    findMenu(user);
                    break;
                case ("add"):
                    add(user);
                    break;
                case ("menu"):
                    flag = false;
                    startMenu();
                    break;
            }
        }
    }

    private void adminMenu(User user) throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("Добро пожаловать администратор! " + user.getEmail());
            System.out.println();
            System.out.println("Для просмотра каталога книг введите view");
            System.out.println("Для просмотра статуса библиотеки введите status");
            System.out.println("Для добавления книги в библиотеку введите add");
            System.out.println("Для поиска книги введите find");
            System.out.println("Редактировать каталог введите edit");
            System.out.println("Для выхода в главное меню введите menu");
            System.out.println();
            String string = br.readLine();

            switch (string) {
                case ("view"):
                    view();
                    break;
                case ("find"):
                    findMenu(user);
                    break;
                case ("add"):
                    addBook(user);
                    break;
                case ("edit"):
                    edit(user);
                    break;
                case ("menu"):
                    flag = false;
                    startMenu();
                    break;
                case ("status"):
                    getAdminLibraryStatus();
                    break;
            }
        }
    }

    private void findMenu(User user) throws IOException {
        System.out.println("Введите заголовок книги или имя автора");
        String string = br.readLine();
        library.findBook(string);
    }

    private void view() {
        for (Book book : library.getCatalog().getBooks()) {
            System.out.println(book.toString());
        }
    }

    private void addBook(User user) throws IOException {
        System.out.println("Введите тип книги электронная electronic, бумажная paper");
        String type = br.readLine();
        if (type.equals("electronic")) {
            System.out.println("Введите название электронной книги");
            String title = br.readLine();
            System.out.println("Введите имя автора");
            String author = br.readLine();
            System.out.println("Введите кол-во страниц");
            int pages = Integer.parseInt(br.readLine());

            library.addBook(new Electronic(title, author, pages));

            System.out.println("Книга успешно добавлена !");

            for (User u : library.getRegData().getUsers()) {
                    Email.sendEmail(user.getEmail(), u.getEmail(), " Администратор : " + user.getEmail() +  " - В библиотеку добавлена книга : Название " + title + " / Автор " + author + " / Количество страниц " + pages);
            }


        }else if(type.equals("paper")){
            System.out.println("Введите название бумажной книги");
            String title = br.readLine();
            System.out.println("Введите имя автора");
            String author = br.readLine();
            System.out.println("Введите кол-во страниц");
            int pages = Integer.parseInt(br.readLine());

            library.addBook(new Paper(title, author, pages));

            System.out.println("Книга успешно добавлена !");

            for (User u : library.getRegData().getUsers()) {
                Email.sendEmail(user.getEmail(), u.getEmail(), " Администратор : " + user.getEmail() +  " - В библиотеку добавлена книга : Название " + title + " / Автор " + author + " / Количество страниц " + pages);
            }

        }else{adminMenu(user);}
    }

    private void add(User user) throws IOException {
        System.out.println("Введите тип книги электронная electronic, бумажная paper");
        String type = br.readLine();
        System.out.println("Введите название книги");
        String title = br.readLine();
        System.out.println("Введите имя автора");
        String author = br.readLine();

        for (User u : library.getRegData().getUsers()) {
            if (u.getRole().equals("admin")) {
                Email.sendEmail(user.getEmail(), u.getEmail(),"Запрос на добавление книги от пользователя : " + user.getEmail() + " - тип " + type + ", название" + title + ", автор " +  author);
            }
        }
    }

    private void edit(User user) throws IOException {
        System.out.println("Введите del, если требуется удалить книгу или пользователя из библиотеки");
        String del = br.readLine();
        if (del.equals("del")) {
            System.out.println("Введите user, если требуется удалить пользователя или book, если требуется удалить книгу из католога!");
            String string = br.readLine();
            if (string.equals("user")) {
                System.out.println("Введите емейл пользователя для удаления");
                String email = br.readLine();
                for (User u : library.getRegData().getUsers()) {
                    if (u.getEmail().equals(email)) {
                        library.getRegData().delUser(u);
                        System.out.println("пользователь библиотеки " + u.getEmail() + " успешно удален !");
                        adminMenu(user);
                        break;
                    }
                }
            } else if (string.equals("book")) {
                System.out.println("Введите название книги для удаления");
                String str = br.readLine();
                for (Book book : library.getCatalog().getBooks()) {
                    if (book.getTitle().equals(str)) {
                        library.getCatalog().delBook(book);
                        System.out.println("Книга под названием " + book.getTitle() + " успешно удалена !");
                        adminMenu(user);
                        break;
                    }
                }
            }
        }
    }
}

import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    Movie head, tail;

    void addAtBeginning(Movie m) {
        if (head == null) {
            head = tail = m;
        } else {
            m.next = head;
            head.prev = m;
            head = m;
        }
    }

    void addAtEnd(Movie m) {
        if (head == null) {
            head = tail = m;
        } else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    void addAtPosition(Movie m, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(m);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < pos && temp.next != null; i++) temp = temp.next;
        if (temp.next == null) {
            addAtEnd(m);
        } else {
            m.next = temp.next;
            m.prev = temp;
            temp.next.prev = m;
            temp.next = m;
        }
    }

    void deleteByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) temp = temp.next;
        if (temp == null) return;
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + ", " + temp.year + ", " + temp.rating);
            }
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + ", " + temp.director + ", " + temp.year);
            }
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieList list = new MovieList();

        while (true) {
            int op = sc.nextInt();
            if (op == 0) break;
            if (op == 1) {
                String title = sc.next();
                String dir = sc.next();
                int year = sc.nextInt();
                double rate = sc.nextDouble();
                list.addAtBeginning(new Movie(title, dir, year, rate));
            } else if (op == 2) {
                String title = sc.next();
                String dir = sc.next();
                int year = sc.nextInt();
                double rate = sc.nextDouble();
                list.addAtEnd(new Movie(title, dir, year, rate));
            } else if (op == 3) {
                int pos = sc.nextInt();
                String title = sc.next();
                String dir = sc.next();
                int year = sc.nextInt();
                double rate = sc.nextDouble();
                list.addAtPosition(new Movie(title, dir, year, rate), pos);
            } else if (op == 4) {
                String title = sc.next();
                list.deleteByTitle(title);
            } else if (op == 5) {
                String director = sc.next();
                list.searchByDirector(director);
            } else if (op == 6) {
                double rate = sc.nextDouble();
                list.searchByRating(rate);
            } else if (op == 7) {
                String title = sc.next();
                double newRate = sc.nextDouble();
                list.updateRating(title, newRate);
            } else if (op == 8) {
                list.displayForward();
            } else if (op == 9) {
                list.displayReverse();
            }
        }
    }
}

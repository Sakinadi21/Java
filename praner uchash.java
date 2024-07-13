package praner;

public class uchash {
    private String name;
    private int age;
    private String birthdate;
    private String email;
    private String institution;

    // Constructor to initialize the fields
    public uchash(String name, int age, String birthdate, String email, String institution) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
        this.email = email;
        this.institution = institution;
    }

    public void displayDetails() {
        System.out.println(name + "\n" + age + " " + birthdate + "\n" + email + "\n" + institution);
    }

    public static void main(String[] args) {
        // Creating an instance of Praner and displaying welcome message
        Praner pranerInstance = new Praner();
        pranerInstance.displayWelcomeMessage();
        System.out.println("--------------------------------------");

        System.out.println("Those people who were there to rescue the group:");
        // Creating instances of uchash and displaying details
        uchash uchash1 = new uchash("Nawer Binta Hafiz", 20, "August 6", "hafiznawer@gmail.com", "Agrabad Maa-O-Shishu hospital medical college");
        uchash1.displayDetails();
        System.out.println("Praner uchash to me is a dream that expresses the joy of the soul.\n" +
                "Hope to see in Shaa Allah we will do a lot of good work\n" +
                "and learn from the past mistakes and move forward in the service of humanity at a steady pace.");
        System.out.println("--------------------------------------");

        uchash uchash2 = new uchash("Hafsa Binte Omar", 20, "August 13", "hafsamaisha23@gmail.com", "National University");
        uchash2.displayDetails();
        System.out.println("Individual commitment to a group effort—that is what makes a team work,\n" +
                "a company work, a society work, a civilization work.\n" +
                "Through the praner uchash we will do a lot of good work together, In Sha Allah.");
        System.out.println("--------------------------------------");

        uchash uchash3 = new uchash("Simanta Majumdar Utsho", 20, "February 23", "shimantautsho@gmail.com", "University of Chittagong");
        uchash3.displayDetails();
        System.out.println("Praner Uchash is a good institution.");
        System.out.println("--------------------------------------");

        uchash uchash4 = new uchash("Shimanta Das", 20, "March 11", "shimanta@gmail.com", "BUET");
        uchash4.displayDetails();
        System.out.println("Praner Uchash has long been an integral part.\n" +
                "If 'call me when you are bored' were an institution, it would be Praner Uchash for me.");
        System.out.println("--------------------------------------");

        uchash uchash5 = new uchash("Sakiba Belal", 20, "April 18", "sakibabelal@gmail.com", "Noakhali Science and Technology University");
        uchash5.displayDetails();
        System.out.println("Praner Uchash is another name of known tree for me.\n" +
                "I wanna work with them till I remember my school days.");
        System.out.println("--------------------------------------");


        System.out.println("Those people were there to protect the group every time:");
        // Creating instances of wise and displaying details
        wise wise1 = new wise("Arnob", "June 30", "CMC");
        System.out.println("Praner Ucchash er sob activities e vallage and ami highly apperciate kori.\n" +
                "Onek dure jaak Praner Uchash, aro bikoshito houk");
        wise1.displayInfo();
        System.out.println("--------------------------------------");

        wise wise2 = new wise("Miraz", "Don't know bday", "BUTEX");
        wise2.displayInfo();
        System.out.println("--------------------------------------");

        wise wise3 = new wise("Misbah uz zamal", "Don't know bday", "DMC");
        wise3.displayInfo();
        System.out.println("--------------------------------------");

        wise wise4 = new wise("Abrar", "Don't know bday", "BUET");
        wise4.displayInfo();
        System.out.println("--------------------------------------");

        wise wise5 = new wise("Rafia Farhana Rafa", "August 21", "Brac University");
        wise5.displayInfo();
        System.out.println("--------------------------------------");

        wise wise6 = new wise("Rafia Sultana", "August 4", "University of Chittagong");
        wise6.displayInfo();
        System.out.println("--------------------------------------");

        wise wise7 = new wise("Rifat Jahan Helen", "June 30", "Cox's Bazar Medical College");
        wise7.displayInfo();
        System.out.println("--------------------------------------");

        wise wise8 = new wise("Amitta", "August 4", "Barry University (confused because of so much scholarship offers)");
        wise8.displayInfo();
        System.out.println("--------------------------------------");

        wise wise9 = new wise("Misbah Uddin Chowdhury Jobraj", "September 11", "University of Chittagong");
        wise9.displayInfo();
        System.out.println("--------------------------------------");

        wise wise10 = new wise("Imran Emu", "July 27", "National University");
        wise10.displayInfo();
        System.out.println("--------------------------------------");

        wise wise11 = new wise("Sarjil Mahmud Khan", "July 18", "Chittagong Medical College");
        wise11.displayInfo();
        System.out.println("--------------------------------------");

        wise wise12 = new wise("Isteak Ahmed Abir", "August 18", "USTC Medical");
        wise12.displayInfo();
        System.out.println("--------------------------------------");

        wise wise13 = new wise("Sudipto Sikder", "January 16", "Asia Pacific University, Malaysia");
        wise13.displayInfo();
        System.out.println("--------------------------------------");

        wise wise14 = new wise("Adnan Faruque", "May 9", "CUET");
        wise14.displayInfo();
        System.out.println("--------------------------------------");

        wise wise15 = new wise("Abdullah Abeer", "Don't know bday", "CUET");
        wise15.displayInfo();
        System.out.println("--------------------------------------");

        wise wise16 = new wise("Mostakim Mohiuddin", "Don't know bday", "Dhaka University");
        wise16.displayInfo();
        System.out.println("--------------------------------------");

        wise wise17 = new wise("Md. Shajidul Islam", "December 10", "KUET");
        wise17.displayInfo();
        System.out.println("--------------------------------------");

        wise wise18 = new wise("Himadri Dey", "Don't know bday", "Dhaka University");
        wise18.displayInfo();
        System.out.println("--------------------------------------");

        wise wise19 = new wise("Dipto Baidya", "February 24", "SUST");
        wise19.displayInfo();
        System.out.println("--------------------------------------");

        wise wise20 = new wise("Mahmuda Akter", "Don't know bday", "University");
        wise20.displayInfo();
        System.out.println("--------------------------------------");

        System.out.println("There were ups and downs while working.\n" +
                "There were clashes, sweet memories, enjoyment, and so on, but\n" +
                "in the end of the day, they were, they are, and they will be, inshaAllah.");
        System.out.println("Thanks all for the faith, love, and\n" +
                "support you gave us.");
        System.out.println("Solicit our name in your prayers.");
    }
}

class Praner {
    public void displayWelcomeMessage() {
        System.out.println("Welcome to Praner Uchash");
        System.out.println("Ontor momo bikosito ontor momo hae");
        System.out.println("Manuser mukhe hasi futate amra koijn praner uchash");
    }
}

class wise {
    private String name;
    private String birthdate;
    private String institution;

    // Constructor to initialize the fields
    public wise(String name, String birthdate, String institution) {
        this.name = name;
        this.birthdate = birthdate;
        this.institution = institution;
    }

    public void displayInfo() {
        System.out.println(name + "\n" + birthdate + "\n" + institution);
    }
}

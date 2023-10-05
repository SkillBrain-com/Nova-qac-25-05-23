

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Foarte important de stiut
        int intiger = 100; //numere intregi
        String text = "ceva text"; //orice fel de text
        double numarCuVirgula = 13.5; //orice numar cu virgula
        boolean bool = true; //adevarat sau fals

        //Mediu important de stiut
        int[] array = {10,20,30}; //Sir de elemente -> nu creste odata cu nevoia
        ArrayList<String> masini = new ArrayList<>();

        //Mai putin important
        byte numar = 15; //numar intreg pana in 256
        short numarMediu = 30000; //numar intreg pana la 30000
        long numarLung = 112313131; //un numar foarte mare mai mare decat int
        float numarCuVirgulaMaiMic = 123.5f; //numar cu virgula mai mic decat double
        char caracter = 'a'; //o singura litera

        //Access modifiers
        public //orice are acest public in fata poate fi access de oriunde din cod
        private //orice are acest private in fata poate fi accesat doar din aceiasi CLASA
        protected //orice are acest protected in fata poate fi accesat din acelasi pachet

        void //inseamna nimic sau vid -> return type pentru metode
        static //se afla in alta buacata de memorie si poate fi accesat direct fara a fi instantiat

        //Principiile OOP(object oriented programing)
        //Abstractizare -> ascundem functionalitate de user si ii aratam doar ce are nevoie sa stie
        //Encapsulare -> getter and setter inseamna protejarea variabilelor/atribute
        //Inheritance/mostenire -> ne perite sa mostenim atribute de la o clasa la alta
        //Polymorfism -> in traducere inseamna "multe forme" -> o metoda poate lua mai multe forme

        //SELECTORS
        //Clasament
        //1. Id-uri
        //2. CSS selector
        //3. xpath

        //Waits
        //Implicit wait -> timp setat per framework cat se va asteptat pentru fiecare element
        //Explicit wait -> timp setat pentru un anumit element -> avem si evenimente dupa care putem astepta(sa devina vizibil, sa devina clickable, sa devina interractible)
        //Fluent wait -> exte practic explicit wait doar ca ii putem seta un interval de timp la care sa reverifice dupa evenimentul asteptat

        //Chrome options
        //driver.manage().window().maximize(); -> dam maximize la fereastra
        //options.addArgument("--incognito); -> setam browserul sa porneasca in modul incognito

        //Design patterns
        //Page object model -> grupare elementelor aferente unei pagini intr-o singura clasa
        //Singleton pattern -> cand vrem continutul unei clase sa se genereze o singura data pe durata unei executii

        //TestNG
        //Annotations -> se pun in fata metodelor sau claselor cu @ in fata
        //@Test -> tot ce e anotat cu @Test este considerat de TestNg ca fiind un test
        //@BeforeMethod -> tot ce e annotat cu @BeforeMethod va fi executat inaintea fiecarei metode din test
        //@AfterMethod -> tot ce e annotat cu @AfterMethod va fi executat dupa fiecare metoda din test
        //@BeforeClass ---"---
        //AfterClass --"----
        //Assertions -> verificari
        Assert.assertEaqual(); -> verifica daca 2 lucruri sunt egale
        Assert.assertTrue(); -> verifica daca un lucru este adevarat

        //Exceptions
        //Sunt lucruri relativ neasteptate ce pot aparea in timpul executiei codului si
        //le putem face handle -> in urma unei exceptii codul continua rularea
        //Eroare -> codul NU poate continua executia -> de cele mai multe ori o eroare
        //este cauzata de mediul in care ruleaza programul nostru

        //GIT
        //git clone <link catre repo> -> copiem un Repo din cloud pe local
        //git add . -> acest git add adauga fisierele pe care le'am modificat in zona de staging pentru a le impinge pe server
        //git commit -m "mesaj" -> we commit to the code si il pregatim sa il impingem pe server
        //git push origin <numele branchului> -> petru a impinge efectiv commitul pe server
        //git pull -> facem update cu ultimele modificari de pe server
        //git checkout -b "nume branch" -> pentru a crea un nou branch cu baza branchul pe care ne aflam deja





    }
}
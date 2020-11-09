package com.company;
import customer.Customer;
import java.util.ArrayList;

class Main {
    public static ArrayList<Customer> clients = new ArrayList<Customer>();
    public static void main(String[] args) {
       createClients();

       //виводимо список п окупців із вказаним іменем
        String name = "Sergei" ;
        System.out.println("Покупці з іменем " + name);
        System.out.println(searchName(name));

        //виводимо покупців із номером картки, який входить в заданий інтервал
        Integer minInterval = 3000, maxInterval = 5000;
        System.out.println("Покупці з картою в інтервалі від " + minInterval + " до " + maxInterval);
        System.out.println(searchCardNumber(minInterval, maxInterval));

        // виводимо покупців із від'ємним балансом рахунку
        System.out.println("Покупці з заборгованістю");
        System.out.println(searchCardCredit() + "Кількість: " +searchCardCreditCount());
    }

    public static void createClients() {
        clients.add(new Customer(1741, "Tarkovsky", "Andrei", "Arsenovich", "Lviv, Bakynska street", 3334, 3000));
        clients.add(new Customer(3522, "Brin", "Sergei", "Mikhaylovich", "Lviv, Belska street", 3142, -1000));
        clients.add(new Customer(3661, "Parajanov", "Sergei", "Hovsepi", "Skole, Kotlyarevska street", 3241, 7423));
        clients.add(new Customer(4521, "Ohorodnyk", "Bohdan", "Igorovich", "Lviv, Rozbizhna street", 4365, 2412));
        clients.add(new Customer(5909, "Gorsky", "Petro", "Olehovich", "Ternopil, Luhanska street", 9754, 4532));
        clients.add(new Customer(2783, "Shutka", "Georgy", "Olehovich", "Kiyv, Mebliarska street", 8975, 1762));
        clients.add(new Customer(7112, "Kuznetz", "Sergei", "Petrovich", "Lviv, Rozheva street", 9573, 2232));
        clients.add(new Customer(8345, "Serp", "Oleh", "Ivanovich", "Kiyv, Bodnarska street", 1522, 1232));
        clients.add(new Customer(7634, "Kozar", "Yaroslav", "Igorovich", "Lviv, Lovetska street", 7854, -3932));
        clients.add(new Customer(1023, "Lemurovich", "Taras", "Ivanovich", "Kiyv, Lutska street", 1323, -9232));
    }


    public static String searchName (String data){
        String result = "";
        for (Customer client : clients) {
            if (client.getName().equals(data)) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }

    public static String searchCardNumber (Integer min, Integer max){
        String result = "";
        for (Customer client : clients) {
            Integer number = (Integer) client.getCard_number();
            if (number > min && number < max) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }

    public static String searchCardCredit(){
        String result = "";
        for (Customer client : clients) {
            Integer money = (Integer) client.getMoney_amount();
            if (money < 0) {
                result += client.toString() + "\n";
            }
        }
        return result;
    }
    public static Integer searchCardCreditCount(){
        Integer result = 0;
        for (Customer client : clients) {
            Integer money = (Integer) client.getMoney_amount();
            if (money < 0) {
                result++;
            }
        }
        return result;
    }
}
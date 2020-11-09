package customer;


public class Customer {
    private Integer id;
    private String surname;
    private String name;
    private String middle_name;
    private String address;
    private Integer card_number;
    private Integer money_amount;

    public Customer(Integer id, String surname, String name, String middle_name, String address, Integer card_number, Integer money_amount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.address = address;
        this.card_number = card_number;
        this.money_amount = money_amount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCard_number(Integer card_number) {
        this.card_number = card_number;
    }

    public void setMoney_amount(Integer money_amount) {
        this.money_amount = money_amount;
    }

    public Integer getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCard_number() {
        return card_number;
    }

    public Integer getMoney_amount() {
        return money_amount;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", address='" + address + '\'' +
                ", card_number=" + card_number +
                ", money_amount=" + money_amount +
                '}';
    }
}


public class Student {
    private String name;
    private String surname;
    private String father_name;
    public String get_name() {
        return name;
    }
    public String get_surname() {
        return surname;
    }
    public String get_father_name() {
        return father_name;
    }
    public void set_name(String name) {
        this.name = name;
    }
    public void set_surname(String name) {
        this.surname = name;
    }
    public void set_father_name(String name) {
        this.father_name = name;
    }
    public void get_fio(){
        System.out.println(surname+" "+name+" "+father_name);
    }
}

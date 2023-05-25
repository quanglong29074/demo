package b9;

public class product {
    private String name;
    private String email;
    private  String Tel;

    public product(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        Tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String toString(){
        return  name+"-"+email+"-"+Tel;
    }
}

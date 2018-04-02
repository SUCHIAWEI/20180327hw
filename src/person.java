public class person {
    private String name,sex,atk, property;
    public person(String name1,String sex1,String atk1,String property1){
        this.setName(name1);
        this.setSex(sex1);
        this.setAtk(atk1);
        this.setProperty(property1);
    }
    public void setName (String name1){ this.name =name1; }
    public String getName() { return name; }

    public void setSex (String sex1){ this.sex =sex1;}
    public String getSex() { return sex; }

    public void setAtk (String atk1){ this.atk =atk1;}
    public String getAtk() { return atk; }

    public void setProperty (String property1){ this.property =property1;}
    public String getProperty() { return property; }

    public void showInfo(){
        System.out.println(this.name+"\t"+this.sex+"\t"+this.atk+"\t"+this.property);
    }
}

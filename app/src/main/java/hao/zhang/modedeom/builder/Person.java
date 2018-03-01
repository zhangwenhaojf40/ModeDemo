package hao.zhang.modedeom.builder;

/**
 * Created by ZhangWenHao on 2018/3/1 0001.
 */

public class Person {


    String name;
    String address;
    int age;
    private Person(Builder builder) {
        name=builder.name;
        address = builder.address;
        age = builder.age;


    }
    public static class Builder{
        String name;
        String address;
        int age;

        public Builder setName(String name) {
            this.name=name;
            return this;
        }
        public Builder setAddress(String address) {
            this.address=address;
            return this;
        }
        public Builder setAge(int age) {
            this.age=age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

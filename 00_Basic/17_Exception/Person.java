public class Person {
    int age;
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("年齢は0以上の数値を指定するべきです。指定値=" + age);
        }
        this.age = age;
    }
}

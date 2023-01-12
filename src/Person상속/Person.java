package Person상속;

public class Person {
    private int age;
    private int sleep;
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    void setSleep(int sleep) {
        this.sleep = sleep;
    }
    int getSleep() {
        return sleep;
    }
}
class Worker extends Person {
    private int work;
    void setWork(int work) {
        this.work = work;
    }
    int getWork() {
        return work;
    }
}
class Student extends Person {
    int study;
    void setStudy(int study) {
        this.study = study;
    }
    String getstudy() {
        String[] syudyStr = {"","\"열심히\"","\"적당히\"","\"놀면서\""};
        return syudyStr[study];
    }
}





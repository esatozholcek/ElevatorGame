package com.example.elevatorgame;

//Mahmut Esat Özhölçek
//20050111068
public class ElevatorPerson {

    private int enterTime;
    private int initialPosition;
    private int target;
    private Person person;

    public ElevatorPerson(Person p, int ip, int t){
        this.person = p;
        this.initialPosition = ip;
        this.target = t;
        enterTime = Elevator.getTravelMeter();
    }

    public Person getPerson() {
        return this.person;
    }

    public int getTarget() {
        return this.target;
    }

    public String toString() {
        if (Math.abs(enterTime - Elevator.getTravelMeter()) <= (target - initialPosition)) {
            return "I am " + person.getName() + ". I traveled " + Math.abs(enterTime - Elevator.getTravelMeter()) + " floors. I am happy.";
        }
        else {
            return "I am " + person.getName() + ". I traveled " + Math.abs(enterTime - Elevator.getTravelMeter()) + " floors. I am unhappy.";
        }

    }



}

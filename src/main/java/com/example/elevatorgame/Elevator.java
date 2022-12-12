package com.example.elevatorgame;

//Mahmut Esat Özhölçek
//20050111068

public class Elevator {

    private int minFloor = 0;
    private int maxFloor = 5;
    private int capacity;
    private int numReachedPeople=0;

    private int currentFloor;
    private MyStack people;
    private static int travelMeter;

    Elevator() {
        this.currentFloor = 0;
        people = new MyStack();
        this.capacity = 4;
        this.minFloor = 0;
        this.maxFloor = 7;
    }

    Elevator(int size, int minFloor, int maxFloor) {
        this.currentFloor = 0;
        people = new MyStack();
        this.capacity = size;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public static int getTravelMeter() {
        return travelMeter;
    }

    // generates an ElevatorPerson and adds it to the people stack if
    //there is available space.
    public boolean enter(Person p, int target) {
        if(target < this.minFloor || target > this.maxFloor) {
            throw new IllegalArgumentException("target " + target + " out of bounds.");
        }
        else if(people.getSize() < this.capacity) {
            ElevatorPerson elevatorPerson = new ElevatorPerson(p,this.currentFloor,target);
            people.push(elevatorPerson);
            System.out.println(p.getName() + " is in");
            return true;
        }
        return false;
    }

    //Elevator goes to the specified floor
    // if the people at the top of the stack reached their target
    // they leave
    public void goToFloor(int floor) {
        if (floor > this.maxFloor || floor < this.minFloor) {
            throw new IllegalArgumentException("This floor does not exists");
        }
        else {
            travelMeter += Math.abs((floor-currentFloor));
            this.currentFloor = floor;
            if(people.peek() != null) {
                if (((ElevatorPerson) people.peek()).getTarget() == this.currentFloor) {
                    numReachedPeople++;
                    System.out.println(((ElevatorPerson) people.peek()).getPerson().getName() + " is out.");
                    System.out.println(people.pop().toString());
                }
            }
                System.out.println(toString());

        }
    }

    public void releaseEveryone(){
        while (!isEmpty()){
            goToFloor(( (ElevatorPerson) people.peek() ).getTarget());
        }
    }

    public boolean isFull() {
        return (people.getSize() == this.capacity);
    }

    public boolean isEmpty() {
        return (people.isEmpty());
    }

    public String toString() {
        return ("Elevator is on floor: " + this.currentFloor + ", Number of people: " + people.getSize());
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public int getMinFloor() {
        return this.minFloor;
    }
    public int getMaxFloor() {
        return this.maxFloor;
    }
    public int getNumReachedPeople() {
        return numReachedPeople;
    }
    public String getNameFirstPerson() {
        if(((ElevatorPerson)people.peek()) == null) {
            return "Elevator is empty";
        }
        return (((ElevatorPerson) people.peek()).getPerson().getName());
    }
    public int getPeopleSize() {
        return people.getSize();
    }

}
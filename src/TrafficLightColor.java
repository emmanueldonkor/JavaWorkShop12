public enum TrafficLightColor {
    RED,GREEN,YELLOW
}

class TrafficLight{
    TrafficLightColor tc= TrafficLightColor.RED;

    public void ChangeColor(){
        switch (tc){
            case RED:
                tc= TrafficLightColor.GREEN;
                break;

            case YELLOW:
                tc=TrafficLightColor.RED;
                break;

            case GREEN:
                tc= TrafficLightColor.YELLOW;
                break;
        }
    }

    public String toString(){return " "+ tc;}
}

 class Task2 {
    public static void main(String[] args) {
        TrafficLight t= new TrafficLight();
        for(int i=0;i < 9; i++){
            System.out.println(t);
            t.ChangeColor();
        }

    }
}
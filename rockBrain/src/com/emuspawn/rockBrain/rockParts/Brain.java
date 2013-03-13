package com.emuspawn.rockBrain.rockParts;

public class Brain {
    String[] memoryLog = new String[5];
    String[] tempMem = new String[5];

    public Brain() {

    }

    public String activity() {
        double t = Math.random() * 5;
        switch ((int) t) {
            case 0:
                return "divide by...";
            case 1:
                return "metal gear?";
            case 2:
                return "I had a thought once. It was awful";
            case 3:
                return "Did you know rocks like motocross?";
            case 4:
                return "When are hats being added?";
            default:
                return "*dial tone*";
        }

        // return "It made it through!";
    }

    public String memory(int q) {
        for (int i = 0; i < 5; i++) {
            tempMem[i] = memoryLog[i];
        }
        tempMem = memoryLog;
        memoryLog[0] = activity();
        memoryLog[1] = "Memory Number 2";
        memoryLog[2] = "Memory Number 3";
        memoryLog[3] = "Memory Number 4";
        memoryLog[4] = "Memory Number 5";
        return memoryLog[q];
    }


    public String getStats() {
        return "Probably Healthy!";
    }
}




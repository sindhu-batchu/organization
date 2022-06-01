package com.test;

public class GasStation {

    public static void main(String args[]) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = 0;
        int n = gas.length;
        int totalGas = 0;
        int count = 0;

        while (n > 0) {
            if (count < gas.length) {
                System.out.println("pos " + pos);
                totalGas = totalGas + gas[pos];
                if (totalGas > cost[pos]) {
                    totalGas = totalGas - cost[pos];
                    n--;
                } else {
                    totalGas = totalGas - gas[pos];
                    n = gas.length;
                    count++;
                }
                if (pos >= gas.length - 1) {
                    pos = pos - (gas.length - 1);
                } else {
                    pos++;
                }
                System.out.println("totalGas " + totalGas);
                return pos;
            } else {
                return -1;
            }
        }
    }
}

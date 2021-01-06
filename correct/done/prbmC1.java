package correct.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prbmC1 {
   static boolean loop_exist = false;
    static class node{
        double velocity;
        double angular_velocty;
        int connected_to;

        public int getConnected_to() {
            return connected_to;
        }

        public void setConnected_to(int connected_to) {
            this.connected_to = connected_to;
        }

        node(double velocity) {
            this.velocity = velocity;
        }

        public double getVelocity() {
            return velocity;
        }

        public void setVelocity(double velocity) {
            this.velocity = velocity;
        }

        public double getAngular_velocty() {
            return angular_velocty;
        }

        public void setAngular_velocty(double angular_velocty) {
            this.angular_velocty = angular_velocty;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        node[] velocity = new node[n];
        for (int i = 0; i <n ; i++) {
            int vel = s.nextInt();
            node obj = new node(vel);
            velocity[i] = obj;

        }
        for (int i = 0; i <q ; i++) {
            int t = s.nextInt();
            if (t == 1){
                int j = s.nextInt();
                double new_velocity = s.nextDouble();
                velocity[j-1].setVelocity(new_velocity);
//                System.out.println(velocity[j-1].getVelocity());
            }
            else if (t == 2){
                int n1 = s.nextInt();
                int n2 = s.nextInt();
//                createLink(n1,n2)
                velocity[n1-1].setConnected_to(n2-1);
//                System.out.println(velocity[n1-1].getConnected_to());
            }
            else if (t == 3){
                int j = s.nextInt();
                int k = s.nextInt();
                double angular_vel_j = s.nextDouble();
                velocity[j-1].setAngular_velocty(angular_vel_j);
                System.out.println(velocity[j-1].getAngular_velocty() +"-> angular velocity og obj 1");
                check_connections(j-1, k-1 ,velocity);
//                velocity[k].setAngular_velocity(angular_vel_k);
                System.out.println(velocity[k-1].getAngular_velocty());
            }
        }
    }
    private static void check_connections(int obj1, int obj2, node[] velocity){
        if (velocity[obj1].getConnected_to() == 0 || loop_exist) {
            return;
        }
        if (velocity[obj1].getConnected_to() == obj2 && !loop_exist){
            System.out.println("call - 1");
            velocity[obj2].setAngular_velocty(calculate_angular_velocity(obj1,obj2,velocity));
        }
        else {
            // find the path between obj1 and obj 2;
            // if there is a loop return 0
//            boolean loop_exist = false;
            boolean[] visited = new boolean[velocity.length];
            ArrayList<Integer> neighbours = new ArrayList<>();
            neighbours.add(obj1);
//            neighbours.add(obj2);
            System.out.println(Arrays.toString(neighbours.toArray()));
            visited[obj1] = true;
//            visited[obj2] = true;
            int neighbour = velocity[obj1].getConnected_to();
            System.out.println(neighbour);
//            neighbours.add(neighbour);
            while (true) {
                if (neighbour == 0) {
                    break;
                } else {
                    //
                    if (neighbour == obj1) {
                        loop_exist = true;
                        return;
                    }
                    else if (neighbour == obj2){
                        neighbours.add(neighbour);
                        break;
                    }
                    if (!visited[neighbour]) {
                        neighbours.add(neighbour);
                        visited[neighbour] = true;
                        neighbour = velocity[neighbour].getConnected_to();
                        System.out.println(Arrays.toString(neighbours.toArray())+ "-> adding");
                    }
                    else if (velocity[neighbour].getConnected_to() == obj1 || visited[neighbour]){
//                        System.out.println(neighbour+1);
                        loop_exist = true;
                        break;
                    }
                }
//                neighbours.add(neighbour);

            }
            System.out.println(Arrays.toString(visited));
            System.out.println(Arrays.toString(neighbours.toArray()));
            if (!loop_exist) {
                System.out.println("call - 2");
                for (int i = 1; i < neighbours.size(); i++) {
                    velocity[i].setAngular_velocty(calculate_angular_velocity(i - 1, i, velocity));

                }
            }
            else {
                System.out.println("loop exist");
                velocity[obj2].setAngular_velocty(0);
            }
        }
    }
    private static double calculate_angular_velocity(int obj1, int obj2, node[] velocity) {
        //check if they are connected or not
        System.out.println(velocity[obj1].getVelocity() + " " + velocity[obj1].getAngular_velocty());
        double radiusOFcurvature_obj1 = velocity[obj1].getVelocity() * velocity[obj1].getAngular_velocty();
        System.out.println(radiusOFcurvature_obj1 + "-> product");
        double angular_vel_ob2 = (radiusOFcurvature_obj1/velocity[obj2].getVelocity());
        System.out.println(angular_vel_ob2);
//        velocity[obj2].setAngular_velocty(angular_vel_ob2);
        return angular_vel_ob2;
    }
}

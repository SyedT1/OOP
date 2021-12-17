/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkprime;

/**
 *
 * @author USER
 */
public class CheckPrime {

    public boolean[] checkprime(int arr[]) {
        int n = arr.length;
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            vis[i] = false;
        }
        vis[0] = vis[1] = true;
        for (int i = 2; i < n; i++) {
            if (vis[i] == false) {
                for (int j = i * i; j < n; j += i) {
                    vis[j] = true;
                }
            }
        }
        return vis;
    }
}

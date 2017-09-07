package com.base.algo;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindCycleInGraph {

    Map<Integer,List<Integer>> adjacencyMatrix;
    Set<Integer> stack = new HashSet<>();
    Set<Integer> visited = new HashSet<>();

    public void initialize(Map<Integer, List<Integer>> adjacencyMatrix) {
        this.adjacencyMatrix=adjacencyMatrix;
    }


    public boolean hasCycle() {
        return checkHasCycle(adjacencyMatrix.keySet().iterator().next());
    }

    private boolean checkHasCycle(Integer next) {
        stack.add(next);
        visited.add(next);
        if (adjacencyMatrix.containsKey(next)) {
            for (Integer i : adjacencyMatrix.get(next)) {
                if (stack.contains(i)) return true;
                if (!visited.contains(i)) checkHasCycle(i);
            }
        }
        stack.remove(next);
        return false;
    }
}

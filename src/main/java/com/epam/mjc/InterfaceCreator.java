package com.epam.mjc;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
             Operation<Integer> operation;
            return operation = T -> {
            List<Integer> newNumb = new ArrayList<>();
            for (int i = 0; i < T.size(); i++) {
              newNumb.add(T.get(i)/divider);
            }
            return newNumb;
        };
}

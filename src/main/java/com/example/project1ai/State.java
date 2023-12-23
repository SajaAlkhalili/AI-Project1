package com.example.project1ai;

import java.util.Objects;

public class State {
    int missionaries;
    int cannibals;
    boolean boat;

    public State(int missionaries, int cannibals, boolean boat) {
        this.missionaries = missionaries;
        this.cannibals = cannibals;
        this.boat = boat;
    }

    //عشان يحسب قيمةال missionaries و cannibals , boat لما نستخدم hashmap
    public int hashCode() {
        return Objects.hash(missionaries, cannibals, boat);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        State state = (State) obj;
        return missionaries == state.missionaries &&
                cannibals == state.cannibals &&
                boat == state.boat;
    }

}
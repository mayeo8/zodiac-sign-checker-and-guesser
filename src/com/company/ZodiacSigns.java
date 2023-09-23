package com.company;

import java.util.ArrayList;

public class ZodiacSigns {
    private boolean willpower;
    private boolean patient;
    private boolean passion;
    private boolean enthusiasm;
    private boolean self_confidence;
    private boolean communication;
    private boolean signs;
    private boolean intelligence;
    private boolean introverted_extroverted;
    private boolean lovers;
    private boolean loyalty;

    public ZodiacSigns(boolean willpower, boolean patient, boolean passion, boolean enthusiasm, boolean self_confidence, boolean communication, boolean signs, boolean intelligence, boolean introverted_extroverted, boolean lovers, boolean loyalty) {
        this.willpower = willpower;
        this.patient = patient;
        this.passion = passion;
        this.enthusiasm = enthusiasm;
        this.self_confidence = self_confidence;
        this.communication = communication;
        this.signs = signs;
        this.intelligence = intelligence;
        this.introverted_extroverted = introverted_extroverted;
        this.lovers = lovers;
        this.loyalty = loyalty;
    }

    public ArrayList<Boolean> getAll(){
        ArrayList<Boolean> user = new ArrayList<>();
        user.add(willpower);
        user.add(patient);
        user.add(passion);
        user.add(enthusiasm);
        user.add(self_confidence);
        user.add(communication);
        user.add(signs);
        user.add(intelligence);
        user.add(introverted_extroverted);
        user.add(lovers);
        user.add(loyalty);
        return user;
    }

    public boolean isWillpower() {
        return willpower;
    }

    public void setWillpower(boolean willpower) {
        this.willpower = willpower;
    }

    public boolean isPatient() {
        return patient;
    }

    public void setPatient(boolean patient) {
        this.patient = patient;
    }

    public boolean isPassion() {
        return passion;
    }

    public void setPassion(boolean passion) {
        this.passion = passion;
    }

    public boolean isEnthusiasm() {
        return enthusiasm;
    }

    public void setEnthusiasm(boolean enthusiasm) {
        this.enthusiasm = enthusiasm;
    }

    public boolean isSelf_confidence() {
        return self_confidence;
    }

    public void setSelf_confidence(boolean self_confidence) {
        this.self_confidence = self_confidence;
    }

    public boolean isCommunication() {
        return communication;
    }

    public void setCommunication(boolean communication) {
        this.communication = communication;
    }

    public boolean isSigns() {
        return signs;
    }

    public void setSigns(boolean signs) {
        this.signs = signs;
    }

    public boolean isIntelligence() {
        return intelligence;
    }

    public void setIntelligence(boolean intelligence) {
        this.intelligence = intelligence;
    }

    public boolean isIntroverted_extroverted() {
        return introverted_extroverted;
    }

    public void setIntroverted_extroverted(boolean introverted_extroverted) {
        this.introverted_extroverted = introverted_extroverted;
    }

    public boolean isLovers() {
        return lovers;
    }

    public void setLovers(boolean lovers) {
        this.lovers = lovers;
    }

    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }
}

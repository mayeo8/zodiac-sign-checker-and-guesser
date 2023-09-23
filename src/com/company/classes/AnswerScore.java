package com.company.classes;

import java.util.ArrayList;

public class AnswerScore {
    private Boolean willpower;
    private Boolean patient;
    private Boolean passion;
    private Boolean enthusiasm;
    private Boolean self_confidence;
    private Boolean communication;
    private Boolean signs;
    private Boolean intelligence;
    private Boolean introverted_extroverted;
    private Boolean lovers;
    private Boolean loyalty;

    public AnswerScore(Boolean willpower, Boolean patient, Boolean passion, Boolean enthusiasm, Boolean self_confidence, Boolean communication, Boolean signs, Boolean intelligence, Boolean introverted_extroverted, Boolean lovers, Boolean loyalty) {
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

    public Boolean getWillpower() {
        return willpower;
    }

    public void setWillpower(Boolean willpower) {
        this.willpower = willpower;
    }

    public Boolean getPatient() {
        return patient;
    }

    public void setPatient(Boolean patient) {
        this.patient = patient;
    }

    public Boolean getPassion() {
        return passion;
    }

    public void setPassion(Boolean passion) {
        this.passion = passion;
    }

    public Boolean getEnthusiasm() {
        return enthusiasm;
    }

    public void setEnthusiasm(Boolean enthusiasm) {
        this.enthusiasm = enthusiasm;
    }

    public Boolean getSelf_confidence() {
        return self_confidence;
    }

    public void setSelf_confidence(Boolean self_confidence) {
        this.self_confidence = self_confidence;
    }

    public Boolean getCommunication() {
        return communication;
    }

    public void setCommunication(Boolean communication) {
        this.communication = communication;
    }

    public Boolean getSigns() {
        return signs;
    }

    public void setSigns(Boolean signs) {
        this.signs = signs;
    }

    public Boolean getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Boolean intelligence) {
        this.intelligence = intelligence;
    }

    public Boolean getIntroverted_extroverted() {
        return introverted_extroverted;
    }

    public void setIntroverted_extroverted(Boolean introverted_extroverted) {
        this.introverted_extroverted = introverted_extroverted;
    }

    public Boolean getLovers() {
        return lovers;
    }

    public void setLovers(Boolean lovers) {
        this.lovers = lovers;
    }

    public Boolean getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Boolean loyalty) {
        this.loyalty = loyalty;
    }
}

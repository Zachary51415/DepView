package me.nettee.depview.model;

public class PlainClass implements Comparable<PlainClass> {

    private final String qualifiedName;

    public PlainClass(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public String getName() {
        return qualifiedName;
    }

    @Override
    public int compareTo(PlainClass that) {
        return this.qualifiedName.compareTo(that.qualifiedName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PlainClass) {
            PlainClass that = (PlainClass) obj;
            return this.qualifiedName.equals(that.qualifiedName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return qualifiedName.hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}
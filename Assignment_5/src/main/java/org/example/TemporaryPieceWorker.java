package org.example;

public class TemporaryPieceWorker extends Employee {
    private double wage;
    private double pieces;

    public TemporaryPieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber);

        if(wage < 0.0 || pieces < 0.0) {
            throw new IllegalArgumentException("Wage/Pieces must be >= 0.0");
        }

        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage <= 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        if(pieces <= 0.0) {
            throw new IllegalArgumentException("Pieces must be >= 0.0");
        }
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("Piece Worker: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "per piece wage", getWage(), "pieces produced", getPieces());
    }
}

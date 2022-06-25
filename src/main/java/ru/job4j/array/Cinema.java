package ru.job4j.array;

/*
public class Cinema {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (i == 0) { //первый ряд
                    if (places[0][0] == null && places[0][1] == null && places[1][0] == null) {   //*левый верхний угол
                        return places[i][j];
                    }
                    if [places[0][j] == null && j < places[i].length && j > 0 && places[0][j - 1] == null && places[0][j + 1] == null && places[1][j] == null){
                }
            }
        }
            return null;
        }




    public static class Place {
                private int row;

                private int cell;

                public Place(int row, int cell) {
                    this.row = row;
                    this.cell = cell;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) {
                        return true;
                    }
                    if (o == null || getClass() != o.getClass()) {
                        return false;
                    }
                    Place place = (Place) o;
                    return row == place.row &&
                            cell == place.cell;
                }

                @Override
                public int hashCode() {
                    return Objects.hash(row, cell);
                }
            }
        }
*/
package flightExample;

public class FlightLeg {

    private final String from;
    private final String to;
    private boolean delayed;
    private String price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {

        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price='" + price + '\'' +
                '}';
    }

    public static class FlightLegBuilder {

        private final String from;
        private final String to;
        private boolean delayed;
        private String price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder price(String price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {

            if(this.price == null) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }

            return new FlightLeg(this);
        }
    }
}

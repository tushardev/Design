package com.design.creational.builder;

public class LunchOrder {

    /*** Builder Class for Lunch Order ***/
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder codiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    /*** Constructor for Lunch Order with Builder as argument **/
    public LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}


/** As there are no setters Lunch Order is immutable **/
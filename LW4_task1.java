import java.util.Objects;

class LW4_task1 {
	public static class Flower {
		private Petal petal;
		private Bud bud;

		public Flower(Petal petal, Bud bud) {
			this.petal = petal;
			this.bud = bud;
		}

		public void bloom() {
			System.out.println("The flower is blooming.");
		}

		public void wither() {
			System.out.println("The flower is withering.");
		}

		public void printBudColor() {
			System.out.println("Bud color: " + bud.getColor());
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Flower flower = (Flower) o;
			return Objects.equals(petal, flower.petal) && Objects.equals(bud, flower.bud);
		}

		@Override
		public int hashCode() {
			return Objects.hash(petal, bud);
		}

		@Override
		public String toString() {
			return "Flower{" +
					"petal=" + petal +
					", bud=" + bud +
					'}';
		}
	}

	public static class Petal {
		private String color;

		public Petal(String color) {
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Petal petal = (Petal) o;
			return Objects.equals(color, petal.color);
		}

		@Override
		public int hashCode() {
			return Objects.hash(color);
		}

		@Override
		public String toString() {
			return "Petal{" +
					"color='" + color + '\'' +
					'}';
		}
	}

	public static class Bud {
		private String color;

		public Bud(String color) {
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Bud bud = (Bud) o;
			return Objects.equals(color, bud.color);
		}

		@Override
		public int hashCode() {
			return Objects.hash(color);
		}

		@Override
		public String toString() {
			return "Bud{" +
					"color='" + color + '\'' +
					'}';
		}
	}

	public static void main(String[] args) {
		Petal petal = new Petal("Red");
		Bud bud = new Bud("Green");

		Flower flower = new Flower(petal, bud);

		System.out.println("Flower Details:");
		System.out.println(flower);

		flower.bloom();
		flower.printBudColor();
		flower.wither();
	}
}

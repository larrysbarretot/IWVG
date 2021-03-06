package designPatterns.exercises.n5_vending.basic.devices;


public class CartridgeCharger extends PanelColleague {

	private int amount;

	private static final int MINIMUM = 1;

	public CartridgeCharger(Panel panel) {
		super(panel);
		panel.set(this);
		amount = 0;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasCartridgeCharger()) {
			panel.activeVending();
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasCartridgeCharger()) {
			panel.deactiveVending();
		}
	}

	public boolean hasCartridgeCharger() {
		return amount >= CartridgeCharger.MINIMUM;
	}

	@Override
	public String toString() {
		return "CartridgeCharger [amount=" + amount + "]";
	}

}

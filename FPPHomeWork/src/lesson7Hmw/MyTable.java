package lesson7Hmw;

public class MyTable {
	private Entry[] entries = new Entry[26];

	public String get(char c) {
		int i = c - 97;
		return entries[i].getString();
	}

	public void add(char c, String s) {
		int i = c - 97;
		Entry ei = new Entry(c, s);
		entries[i] = ei;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry e : entries) {
			if (e != null)
				sb.append(e.toString() + "\n");
		}
		return sb.toString();
	}

	private class Entry {
		private char ch;
		private String str;

		Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		public String getString() {
			return this.str;
		}

		public String toString() {
			return this.ch + " -> " + this.str;
		}
	}
}


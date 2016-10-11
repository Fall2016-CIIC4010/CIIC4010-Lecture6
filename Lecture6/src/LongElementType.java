
public class LongElementType extends ElementType {

	private long theNumber;
	
	public LongElementType(long l) {
		theNumber = l;
	}

	public boolean greaterThan(ElementType e) {
		//		LongElementType eLong = (LongElementType) e;
		//		return (this.theNumber > eLong.theNumber);
		return (this.valueOf() > e.valueOf());
	}

	public long valueOf() {
		return this.theNumber;
	}

	public boolean equals(ElementType e) {
		return (this.valueOf() == e.valueOf());
	}
}

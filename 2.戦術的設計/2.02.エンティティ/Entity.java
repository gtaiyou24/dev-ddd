// Entity抽象クラス
public class Entity extends IdentifiedDomainObject {
    private static final long serialVersionUID = 1L;

    protected Entity() {
        super();
    }

    // 「同一性」を判定
    public boolean equals();

    // 「同一性」を判定
    public String hashCode();
}
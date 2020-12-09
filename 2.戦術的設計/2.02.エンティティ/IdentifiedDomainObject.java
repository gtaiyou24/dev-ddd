/*
 *「レイヤスーパータイプ」で共通処理を実装
 */

// Entity抽象クラスの親クラス
public class IdentifiedDomainObject extends AssertionConcern implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;  // 「代理識別子」

    protected IdentifiedDomainObject() {
        super();
        this.setId(-1);
    }

    // ドメイン上で意味を持つ一意な識別子とは異なり、Hibernateが使用する代理識別子の「id」属性はprotectedで宣言し、
    // クライアントに見えないように制御する。
    protected long id() {
        return this.id;
    }
    private void setId(long anId) {
        this.id = anId;
    }
}
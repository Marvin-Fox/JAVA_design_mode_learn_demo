package adapter_pattern;

/**
 * 客户角色 Client 港版插头
 */
public class ClientHongKongSocket {
    /**
     * 接受港版插座面板作为参数
     * 港版插头,插入到港版插座面板
     *
     * @param hongKongPanel
     */
    public void plugIn(HongKongPanel hongKongPanel) {
        System.out.println("港版插头 插入");
        hongKongPanel.offerHongKongElectricity();
    }
}

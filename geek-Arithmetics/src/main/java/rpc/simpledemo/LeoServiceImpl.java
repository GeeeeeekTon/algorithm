package rpc.simpledemo;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author :tongzilong@mgzf.com
 * @see: [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class LeoServiceImpl implements ILeoService {
    @Override
    public String leo(String name) {
        return "hello " + name;
    }
}

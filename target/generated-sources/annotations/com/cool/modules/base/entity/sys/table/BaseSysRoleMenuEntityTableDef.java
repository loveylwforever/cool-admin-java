package com.cool.modules.base.entity.sys.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class BaseSysRoleMenuEntityTableDef extends TableDef {

    public static final BaseSysRoleMenuEntityTableDef BASE_SYS_ROLE_MENU_ENTITY = new BaseSysRoleMenuEntityTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MENU_ID = new QueryColumn(this, "menu_id");

    public final QueryColumn ROLE_ID = new QueryColumn(this, "role_id");

    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");

    public final QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, MENU_ID, ROLE_ID, CREATE_TIME, UPDATE_TIME};

    public BaseSysRoleMenuEntityTableDef() {
        super("", "base_sys_role_menu");
    }

    private BaseSysRoleMenuEntityTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public BaseSysRoleMenuEntityTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new BaseSysRoleMenuEntityTableDef("", "base_sys_role_menu", alias));
    }

}

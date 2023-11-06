/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.hbase.command;

import org.lealone.db.session.ServerSession;
import org.lealone.plugins.hbase.server.HBaseServerEngine;
import org.lealone.sql.SQLEngineBase;

public class HBaseCommandEngine extends SQLEngineBase {

    public HBaseCommandEngine() {
        super(HBaseServerEngine.NAME);
    }

    @Override
    public String quoteIdentifier(String identifier) {
        return HBaseCommandParser.quoteIdentifier(identifier);
    }

    @Override
    public HBaseCommandParser createParser(ServerSession session) {
        return new HBaseCommandParser(session);
    }
}

/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.hbase.command;

import com.lealone.db.session.ServerSession;
import com.lealone.sql.SQLEngineBase;

import com.lealone.plugins.hbase.server.HBaseServerEngine;

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

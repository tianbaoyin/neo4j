/*
 * Copyright (c) 2002-2020 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cli;

import java.util.concurrent.Callable;

public interface Command extends Callable<Integer>
{
    enum CommandType
    {
        ONLINE_BACKUP,
        RESTORE_DB,
        LOAD,
        UNBIND,
        CHECK_CONSISTENCY,
        DIAGNOSTICS_REPORT,
        MEMORY_RECOMMENDATION,
        STORE_INFO,
        STORE_COPY,
        IMPORT,
        PUSH_TO_CLOUD,
        SET_DEFAULT_ADMIN,
        SET_INITIAL_PASSWORD,
        DUMP
    }
}

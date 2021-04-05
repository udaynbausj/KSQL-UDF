package com.pratilipi.ksql.udf;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;

@UdfDescription(name = "timestamp",description = "returns unix timestamp")
public class Timestamp {

    @Udf(description = "returns unix timestamp")
    public long CurrentTimestamp() {
        return System.currentTimeMillis();
    }

}

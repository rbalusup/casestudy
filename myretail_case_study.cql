

CREATE TABLE IF NOT EXISTS myretail.inventory (
  product_id text,
  location_id text,
  location_type text,
  avail_on_hand double,
  avail_on_hand_sync_time timestamp,
  PRIMARY KEY (product_id, location_id)
) WITH CLUSTERING ORDER BY (location_id ASC);

--CREATE INDEX ON myretail.inventory (location_type);

CREATE TABLE IF NOT EXISTS myretail.product_demand (
	product_id text,
	reservation_id text,
	demand_qty double,
	update_timestamp timestamp,
	PRIMARY KEY ((product_id), reservation_id)
);

CREATE TABLE IF NOT EXISTS myretail.product_supply (
    product_id text,
    location_id text,
    update_timestamp timestamp,
    reservation_id text,
    supply_qty double,
    PRIMARY KEY (product_id,location_id, update_timestamp, reservation_id) )
WITH CLUSTERING ORDER BY (location_id ASC, update_timestamp DESC);

CREATE TABLE IF NOT EXISTS myretail.product_location_demand (
	product_id text,
	location_id text,
	reservation_id text,
	demand_qty double,
	update_timestamp timestamp,
	PRIMARY KEY ((product_id), location_id, reservation_id)
);

create table IF NOT EXISTS myretail.track_inventory_changes (
  product_id text,
  location_id text,
  year int,
  updated_time timestamp,      
  change_id timeuuid,
  available_on_hand double,
  available_on_hand_update_time timestamp,
  primary key ((product_id, location_id, year), updated_time)
) with clustering order by (updated_time desc) ;

CREATE TABLE IF NOT EXISTS myretail.track_inventory (
  product_id text,
  location_id text,
  sync_time timestamp,
  update_time timestamp,
  balance double,
  change_id timeuuid,
  PRIMARY KEY ((product_id, location_id, sync_time), update_time)
) WITH CLUSTERING ORDER BY (update_time ASC) ;

CREATE TABLE IF NOT EXISTS myretail.location (
  location_id text PRIMARY KEY,
  latlong text,
  type text
); 
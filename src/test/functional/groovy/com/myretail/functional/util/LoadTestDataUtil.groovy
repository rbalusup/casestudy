package com.myretail.functional.util

class LoadTestDataUtil {
	
	public static insertMyRetailData() {/*
		Map<Integer, Map> testDataLocationEligibilities =
				[
					locationId : [location_id:locationId, capacity:100, is_hold:true, is_ship_to_guest:true, is_rush:true, is_enhanced_ship_to_guest:true, is_ship_to_store:true, ship_to_guest_cutoff_time:'2014-09-18T03:25:00.000+0000', rush_cutoff_time:'2014-09-17T18:30:00.000+0000', capacity_reached_expiration_time:'2015-02-10T16:44:23.493+0000', is_capacity_reached_computed:false, is_enhanced_ship_to_guest_computed:true, is_ship_to_guest_computed:true]
				]
		Map<String, Map> testDataProductLocation =
				[ dpci : [dpci:dpci,is_hold:false, is_rush:true, is_ship_to_guest:true, is_ship_to_store:true]]

		Map<String, Map> testDataInventoryLocation =
				[
					"1":[product_id:tcin,location_id:String.valueOf(locationId),location_type_code:locationTypeCode,vendor:'',on_hand:onHandQty,on_hand_sync_time:'2015-05-17T18:30:00.000+0000',damaged:0.0,damaged_sync_time:'2015-05-17T18:30:00.000+0000']
				]
		Map<String, Map> testDataInventory =
				[
					"1":[product_id:tcin,location_id:String.valueOf(locationId),location_type_code:locationTypeCode,vendor:'',on_hand:onHandQty,on_hand_sync_time:'2015-05-17T18:30:00.000+0000',damaged:0.0,damaged_sync_time:'2015-05-17T18:30:00.000+0000']
				]

		Map<String, Map> testDataTCINMapping =[ tcin : [tcin:tcin,dpci:dpci]]
		Map<String, Map> testDataProductThreshold =[ dpci: [dpci:dpci, setting:"M", quantity:0]]
		Map<String, Map> testDataProduct =[tcin : [tcin:tcin]]
		Map<String, Map> testDataProductEligibilityByLocation =
				[
					"1" : [dpci:dpci, location_id:locationId, is_hold:false, is_rush:true, is_ship_to_guest:true, is_ship_to_store:true, is_ship_to_store:true, kill_switch_expiration_time:'2014-09-18T03:25:00.000Z']
				]

		Map<Integer, Map> testData =
				[
					locationId : [location_id:locationId, capacity:100, is_hold:true, is_ship_to_guest:true, is_rush:true, is_enhanced_ship_to_guest:true, is_ship_to_store:true, ship_to_guest_cutoff_time:'2014-09-18T03:25:00.000+0000', rush_cutoff_time:'2014-09-17T18:30:00.000+0000', capacity_reached_expiration_time:'2015-02-10T16:44:23.493+0000', is_capacity_reached_computed:false, is_enhanced_ship_to_guest_computed:true, is_ship_to_guest_computed:true]
				]


		Map<String, Map> testDataBarCodeMapping =
				[  "8971373383" : [barcode:"8971373383",classId:Integer.valueOf(classId),departmentId:Integer.valueOf(departmentId),itemId:Integer.valueOf(itemId),tcin:tcin]]

		Map<String, Map> testDatadpciTCINMapping =
				[  "1" : [departmentId:Integer.valueOf(departmentId),classId:Integer.valueOf(classId),itemId:Integer.valueOf(itemId),tcins: [tcin] as Set<String>,nonObsoleteTcins: [tcin] as Set<String>]]

		String locationIdString = String.valueOf(locationId)

		Map<String, Map> testDataInStoreLocation =
				[
					locationIdString : [departmentId:Integer.valueOf(departmentId),classId:Integer.valueOf(classId),itemId:Integer.valueOf(itemId),locationId:locationId]
				]

		Map onlineProductVAPMap =
				[
					"tcin": tcin,
					"alternateIdentifier": '',
					"alternateIdentifierType": '',
					"availabilityCode": '',
					"availabilityStatus": '',
					"backOrderPreOrder": false,
					"channelAvailabilityStatus": 'Available Online Only',
					"channelAvailabilityCode": 2,
					"consolidatedOverallRating": '4.5',
					"currentPrice": 10.29,
					"dataPageLink": 'http://www.target.com/p/circo-fleece-changing-pad-cover/-/A-14352870',
					"dpci": dpci,
					"externalAltImages": '[]',
					"externalPrimaryImage": 'http://target.scene7.com/is/image/Target/14352870',
					"iacAttributes": '',
					"iacCategories": '',
					"internalAltImages": '["http://Img2.targetimg2.com/wcsstore/TargetS AS/img/p/14/35/14352870_201310091348_50x50.jpg"]',
					"internalPrimaryImage": 'http://Img2.targetimg2.com/wcsstore/TargetSAS/img/p/14/35/14352870_201310091348.jpg',
					"internalSwatchImage": '',
					"internalThumbnailImage": 'http://Img2.targetimg2.com/wcsstore/TargetSAS/img/p/14/35/14352870_201310091348_75x75.jpg',
					"isStoreOnlyItemPriceDisplay": true,
					"itemStatusCode": '0',
					"itemStatus": 'Active',
					"launchDate": '2013-01-01 00:00:00-0600',
					"manufacturerBrand": 'manufacturerBrand',
					"manufacturerName": 'Triboro Quilts, MFG',
					"manufacturerPartNumber": '',
					"mapPrice": 0,
					"modelNumber": '',
					"onlineBrandName": 'Circo',
					"onlineDescription": 'Circo Fleece Changing Pad Cover',
					"onlineProductTypeHierarchy": '[100~Target|4258~baby|85502~baby ways to shop|357507~top registry picks"]',
					"onlineProductTypeHierarchyKeys": '["357507~top registry picks","4274~changing pads &#38; covers"]',
					"onlineVariationsAgeGroup": 'Newborn and Up',
					"onlineVariationsColor": '',
					"onlineVariationsGender": '',
					"onlineVariationsGiftcardDelivery": '',
					"onlineVariationsGiftcardDenominations": '',
					"onlineVariationsMaterial": 'Polyester,Cotton',
					"onlineVariationsPattern":  '',
					"onlineVariationsSize": '',
					"originalPrice": 10.29,
					"priceCode": '0',
					"relation": 'VAP',
					"secAlternateIdentifiers": '']

		Map<String, Map> testDataOnlineproduct =[locationIdString : onlineProductVAPMap]

		// Load data set for get all
		testData.each() { key, value ->
			Map copyData = value.clone()
			copyData.remove('is_capacity_reached_computed')
			copyData.remove('is_enhanced_ship_to_guest_computed')
			copyData.remove('is_ship_to_guest_computed')
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEligibility, "location_eligibility", copyData)
		}
		testDataProductLocation.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEligibility, "product_eligibility", copyData)
		}

		testDataProductEligibilityByLocation.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEligibility, "product_location_eligibility", copyData)
		}

		testDataProductThreshold.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEligibility, "product_threshold", copyData)
		}

		testDataTCINMapping.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEligibility, "tcin_mapping", copyData)
		}

		testDataInventory.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceInventory, "inventory", copyData)
		}

		testDataInventoryLocation.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceInventory, "inventory_at_location", copyData)
		}

		testDataInventoryLocation.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceInventory, "inventory_by_vendor", copyData)
		}

		testDataProduct.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceProduct, "product", copyData)
		}

		testDataBarCodeMapping.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEsv, "barcodeMapping", copyData)
		}

		testDatadpciTCINMapping.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEsv, "dpciMapping", copyData)
		}

		testDataInStoreLocation.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEsv, "inStoreLocation", copyData)
		}

		testDataOnlineproduct.each() { key, value ->
			Map copyData = value.clone()
			ODSDataUtilsWrapper.INSTANCE.odsDataLoaderUtils.executeInsert(keyspaceEsv, "onlineProduct", onlineProductVAPMap)
		}
	*/}

}

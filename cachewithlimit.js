var TimeLimitedCache = function() {
    // This object will store key-value pairs and their expiration times
    this.cache = {};
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const currentTime = Date.now();  // Get the current time
    const expirationTime = currentTime + duration;  // Calculate when the key will expire
    
    if (this.cache[key] && this.cache[key].expiration > currentTime) {
        // If the key exists and has not expired, update its value and expiration time
        this.cache[key].value = value;
        this.cache[key].expiration = expirationTime;
        return true; // Return true indicating that the key was updated
    }

    // If the key doesn't exist or has expired, set a new key-value pair with expiration
    this.cache[key] = { value, expiration: expirationTime };
    return false; // Return false indicating that the key was not pre-existing
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    const currentTime = Date.now();  // Get the current time

    // Check if the key exists and hasn't expired
    if (this.cache[key] && this.cache[key].expiration > currentTime) {
        return this.cache[key].value;  // Return the value associated with the key
    }

    // If the key does not exist or has expired, return -1
    return -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    const currentTime = Date.now();
    let validCount = 0;

    // Iterate through all keys in the cache and count the ones that have not expired
    for (const key in this.cache) {
        if (this.cache[key].expiration > currentTime) {
            validCount++;
        }
    }

    return validCount;  // Return the count of non-expired keys
};

/**
 * Example usage:
 * const timeLimitedCache = new TimeLimitedCache();
 * timeLimitedCache.set(1, 42, 1000); // false (key is newly added)
 * console.log(timeLimitedCache.get(1)); // 42 (value for key 1)
 * console.log(timeLimitedCache.count()); // 1 (1 key is valid)
 */

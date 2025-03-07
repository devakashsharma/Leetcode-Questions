var createCounter = function(init) {
    let val = init;

    function increment() {
        return ++val;
    }

    function reset() {
        return val = init;
    }

    function decrement() {
        return --val;
    }

    return {increment, reset, decrement};
};
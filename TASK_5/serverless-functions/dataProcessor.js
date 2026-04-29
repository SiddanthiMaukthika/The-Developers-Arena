exports.handler = async (event) => {
    
    const data = JSON.parse(event.body || "{}");

    let result;

    if (data.value > 70) {
        result = "High traffic detected";
    } else if (data.value > 40) {
        result = "Normal activity";
    } else {
        result = "Low activity";
    }

    return {
        statusCode: 200,
        body: JSON.stringify({
            message: result,
            input: data.value
        }),
    };
};